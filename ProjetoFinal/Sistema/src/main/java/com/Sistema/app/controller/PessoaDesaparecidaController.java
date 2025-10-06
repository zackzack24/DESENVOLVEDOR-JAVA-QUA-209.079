package com.Sistema.app.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.PathVariable;

import com.Sistema.app.model.PessoaDesaparecida;
import com.Sistema.app.repository.AppRepository;

@Controller
public class PessoaDesaparecidaController {

    @Autowired
    private AppRepository appRepository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    // @RequestMapping("/lista")
    // public String lista() {
    //     return "lista";
    // }

    @RequestMapping("/index")
    public String redirectToIndex() {
        return "redirect:/";
    }    

    @RequestMapping("/buscar")
    public String buscar() {
        return "buscar";
    }

    @RequestMapping(value = "/cadastro", method = RequestMethod.GET)
    public String cadastro() {
        return "cadastro";
    }

    @RequestMapping(value = "/cadastro", method = RequestMethod.POST)
    public String cadastro(PessoaDesaparecida pessoa, RedirectAttributes attributes) {
        // Garantir que o campo encontrada comece como false
        pessoa.setEncontrada(false);
        // Se você tem dois campos de nome, copie um para o outro
        if (pessoa.getNomeCompletoCadastro() != null) {
            pessoa.setNomeCompleto(pessoa.getNomeCompletoCadastro());
        }
        appRepository.save(pessoa);
        attributes.addFlashAttribute("mensagem", "Pessoa cadastrada com sucesso!");
        return "redirect:/index";
    }

    // LISTAR PESSOAS
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("index");
        Iterable<PessoaDesaparecida> pessoas = appRepository.findAll();
        mv.addObject("pessoas", pessoas);
        return mv;
    }

    // MÉTODO PARA ALTERAR PESSOA - CORRIGIDO
    @RequestMapping(value = "/alterarPessoa/{idPessoaDesaparecida}", method = RequestMethod.GET)
    public ModelAndView alterarPessoa(@PathVariable("idPessoaDesaparecida") long idPessoaDesaparecida) {
        ModelAndView mv = new ModelAndView("alterarPessoa"); // ← Deve apontar para "alterarPessoa"
        Optional<PessoaDesaparecida> pessoaOpt = appRepository.findById(idPessoaDesaparecida);

        if (pessoaOpt.isPresent()) {
            mv.addObject("pessoa", pessoaOpt.get());
        } else {
            return new ModelAndView("redirect:/index");
        }
        return mv;
    }
    // @RequestMapping(value = "/alterarPessoa/{idPessoaDesaparecida}", method =
    // RequestMethod.GET)
    // public ModelAndView alterarPessoa(@PathVariable("idPessoaDesaparecida") long
    // idPessoaDesaparecida) {
    // ModelAndView mv = new ModelAndView("alterarPessoa");
    // Optional<PessoaDesaparecida> pessoaOpt =
    // appRepository.findById(idPessoaDesaparecida);

    // if (pessoaOpt.isPresent()) {
    // mv.addObject("pessoa", pessoaOpt.get());
    // } else {
    // // Se não encontrar, redireciona para a lista
    // return new ModelAndView("redirect:/index");
    // }
    // return mv;
    // }

    @RequestMapping(value = "/alterarPessoa", method = RequestMethod.POST)
    public String alterarPessoa(PessoaDesaparecida pessoa, RedirectAttributes attributes) {
        // Manter a consistência entre os dois campos de nome
        if (pessoa.getNomeCompletoCadastro() != null) {
            pessoa.setNomeCompleto(pessoa.getNomeCompletoCadastro());
        }
        appRepository.save(pessoa);
        attributes.addFlashAttribute("mensagem", "Pessoa atualizada com sucesso!");
        return "redirect:/index";
    }

    // MÉTODO PARA EXCLUIR PESSOA
    @RequestMapping(value = "/excluirPessoa/{idPessoaDesaparecida}", method = RequestMethod.GET)
    public String excluirPessoa(@PathVariable("idPessoaDesaparecida") Long idPessoaDesaparecida,
            RedirectAttributes attributes) {
        appRepository.deleteById(idPessoaDesaparecida);
        attributes.addFlashAttribute("mensagem", "Pessoa excluída com sucesso!");
        return "redirect:/index";
    }
}