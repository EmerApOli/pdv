package com.pdv.api.assembler;

import com.pdv.domain.model.Produto;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ProdutoInputDisassembler {


    @Autowired
    private ModelMapper modelMapper;

    public Produto toDomainObject(ProdutoInputDisassembler restauranteInput) {
        return modelMapper.map(restauranteInput, Produto.class);
    }


}
