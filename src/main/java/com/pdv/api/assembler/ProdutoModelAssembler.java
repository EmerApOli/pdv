package com.pdv.api.assembler;

import com.pdv.domain.model.Produto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class ProdutoModelAssembler {



    @Autowired
    private ModelMapper modelMapper;

    public Produto toModel(Produto produto) {
        return modelMapper.map(produto, Produto.class);
    }

    public List<Produto> toCollectionModel(List<Produto> produtos) {
        return produtos.stream()
                .map(produto -> toModel(produto))
                .collect(Collectors.toList());
    }


}
