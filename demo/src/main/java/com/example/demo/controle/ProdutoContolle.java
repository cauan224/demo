package com.example.demo.controle;

import com.example.demo.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class ProdutoContolle {

    @RestController
    @RequestMapping("/produto")
    public class ProdutoController {
     private ProdutoContolle produtoContolle;

        public ProdutoController(ProdutoContolle produtoContolle) {
            this.produtoContolle = produtoContolle;
        }
    }
    @GetMapping
    public List<Produto> listaproduto(){
        return listaproduto();
    }

}
