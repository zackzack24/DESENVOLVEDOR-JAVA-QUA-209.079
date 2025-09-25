package com.Sistema.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired; // ok
import org.springframework.stereotype.Controller; // ok 
import org.springframework.validation.BindingResult; // binding result 
import org.springframework.validation.annotation.Validated; // ok
import org.springframework.web.bind.annotation.RequestMapping; // ok
import org.springframework.web.bind.annotation.RequestMethod; // ok
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes; // ok
// import org.springframework.web.bind.annotation.RequestParam; // request param
import org.springframework.web.bind.annotation.PathVariable; // path variable // ok

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

    // @RequestMapping("/")
    // public String cadastro() {
    // return "cadastro";
    // }

    @RequestMapping("/lista")
    public String lista() {
        return "lista";
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
    public String cadastro(PessoaDesaparecida pessoa) {
        // Lógica para salvar a pessoa desaparecida no repositório
        appRepository.save(pessoa);
        return "redirect:/lista"; // Redireciona para a lista após o cadastro
    }

    // listar pessoas desaparecidas
    @RequestMapping(value = "/lista", method = RequestMethod.GET)
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("lista");
        Iterable<PessoaDesaparecida> pessoas = appRepository.findAll();
        mv.addObject("pessoas", pessoas);
        return mv;
        // Lógica para obter a lista de pessoas desaparecidas do repositório
        // List<PessoaDesaparecida> pessoas = appRepository.findAll();
        // mv.addObject("pessoas", pessoas);
    }

    // método para alterar pessoa ABAIXO, ainda não fiz o html

    @RequestMapping(value = "/alterarPessoa/{idPessoaDesaparecida}", method = RequestMethod.GET)
    public ModelAndView alterarPessoa(@PathVariable("idPessoaDesaparecida") long idPessoaDesaparecida) {
        PessoaDesaparecida pessoa = appRepository.findById(idPessoaDesaparecida);
        ModelAndView mv = new ModelAndView("AlterarPessoaDesaparecida");
        mv.addObject("pessoa", pessoa);
        return mv;
    }

    @RequestMapping(value = "/alterarPessoa/{idPessoaDesaparecida}", method = RequestMethod.POST)
    public String alterarPessoa(@Validated PessoaDesaparecida pessoa, BindingResult result,
            RedirectAttributes atributes) {
        appRepository.save(pessoa);
        return "redirect:/lista"; // Redireciona para a lista após a alteração
    }
    // FIM DOS METODOS DE ALTERAR PESSOA

    // método para excluir pessoa
    @RequestMapping(value = "/excluirPessoa/{idPessoaDesaparecida}", method = RequestMethod.POST)
    public String excluirPessoa(@PathVariable("idPessoaDesaparecida") Long idPessoaDesaparecida) {
        appRepository.deleteById(idPessoaDesaparecida);
        return "redirect:/lista"; // Redireciona para a lista após a exclusão
    }

}
