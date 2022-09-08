package com.separapecas.separapecas;

import com.separapecas.separapecas.model.Prateleira;
import com.separapecas.separapecas.model.Produto;
import com.separapecas.separapecas.model.Quadrante;
import com.separapecas.separapecas.service.PrateleiraService;
import com.separapecas.separapecas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class SeparapecasApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SeparapecasApplication.class, args);
    }

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private PrateleiraService prateleiraService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("***** INICIANDO ALGORITMO *****\nBuscando Dados");
        List<Produto> listProduto = new ArrayList<>();
        int randomNum;
        for(int i  = 0; i < 10 ; i++) {
            randomNum = ThreadLocalRandom.current().nextInt(1, 35);
            listProduto.add(produtoService.findById(randomNum));
        }

        List<Prateleira> prateleiras = prateleiraService.findAll();
        List<Produto> listaOrganizada = ordena(listProduto, prateleiras);
        System.out.print("\nLista Organizada\n");
        listaOrganizada.stream().forEach(p -> {
            System.out.println(p.getDescricao() + " / Localização : " + p.getLocalizacao());
        });
        System.out.println("***** FINALIZADO COM SUCESSO *****");
    }

    public List<Produto> ordena(List<Produto> listProdutos, List<Prateleira> prateleiras) {
        System.out.println("\n\nLista Original\n");
        listProdutos.stream().forEach(p -> {
            System.out.println(p.getDescricao() + " / Localização: " + p.getLocalizacao());
        });
        List<Produto> produtosQ1 = new ArrayList<>();
        List<Produto> produtosQ2 = new ArrayList<>();
        List<Produto> produtosQ3 = new ArrayList<>();
        List<Produto> produtosQ4 = new ArrayList<>();
        List<Produto> produtosQ5 = new ArrayList<>();
        List<Produto> listaOrdenada = new ArrayList<>();

        System.out.print("\nSorting...\n");
        listProdutos.stream().forEach(p -> {
            prateleiras.stream().forEach(pr -> {
                if (pr.getIdPrateleira().equals(getPrateleira(p.getLocalizacao()))) {
                    p.setPrateleiraCodigo(pr.getCodigo());
                    if (pr.getQuadrante().equals(Quadrante.QUAD1)) {
                        produtosQ1.add(p);
                    } else if (pr.getQuadrante().equals(Quadrante.QUAD2)) {
                        produtosQ2.add(p);
                    } else if (pr.getQuadrante().equals(Quadrante.QUAD3)) {
                        produtosQ3.add(p);
                    } else if (pr.getQuadrante().equals(Quadrante.QUAD4)) {
                        produtosQ4.add(p);
                    } else if (pr.getQuadrante().equals(Quadrante.QUAD5)){
                        produtosQ5.add(p);
                    }
                }
            });
        });

        if(!produtosQ4.isEmpty()){
            produtosQ4.sort(Comparator.comparingInt(Produto :: getPrateleiraCodigo));
            listaOrdenada.addAll(produtosQ4);
        }
        if(!produtosQ2.isEmpty()){
            produtosQ2.sort(Collections.reverseOrder(Comparator.comparingInt(Produto :: getPrateleiraCodigo)));
            listaOrdenada.addAll(produtosQ2);
        }
        if(!produtosQ1.isEmpty()){
            produtosQ1.sort(Collections.reverseOrder(Comparator.comparingInt(Produto :: getPrateleiraCodigo)));
            listaOrdenada.addAll(produtosQ1);
        }
        if(!produtosQ5.isEmpty()){
            produtosQ5.sort(Collections.reverseOrder(Comparator.comparingInt(Produto :: getPrateleiraCodigo)));
        }
        if(!produtosQ3.isEmpty()){
            produtosQ3.sort(Collections.reverseOrder(Comparator.comparingInt(Produto :: getPrateleiraCodigo)));
            listaOrdenada.addAll(produtosQ3);
        }
        return listaOrdenada;

    }
    
    private String getPrateleira(String localizacao){
        return localizacao.substring(0, localizacao.indexOf("-"));
    }

}
