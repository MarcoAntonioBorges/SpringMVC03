package br.com.fiap.exemplo4.controller;

import br.com.fiap.exemplo4.bean.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("produto")
public class ProdutoController {

    @GetMapping("form")
    public String form(){
        return "produto/form";
    }

    @PostMapping("cadastrar")
    public String cadastrar(Produto produto, Model model){
        model.addAttribute("prod", produto);
        return "produto/sucesso";
    }

}
