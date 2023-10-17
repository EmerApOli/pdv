package com.pdv.api.controller;

import com.pdv.api.assembler.PedidoInputDisassembler;
import com.pdv.api.assembler.PedidoModelAssembler;
import com.pdv.api.assembler.PedidoResumoModelAssembler;
import com.pdv.api.model.PedidoModel;
import com.pdv.api.model.PedidoResumoModel;
import com.pdv.api.model.input.PedidoInput;
import com.pdv.domain.exception.EntidadeNaoEncontradaException;
import com.pdv.domain.exception.NegocioException;
import com.pdv.domain.model.Pedido;
import com.pdv.domain.repository.PedidoRepository;
import com.pdv.domain.service.EmissaoPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private EmissaoPedidoService emissaoPedido;
	
	@Autowired
	private PedidoModelAssembler pedidoModelAssembler;
	
	@Autowired
	private PedidoResumoModelAssembler pedidoResumoModelAssembler;
	
	@Autowired
	private PedidoInputDisassembler pedidoInputDisassembler;
	
	@GetMapping
	public List<PedidoResumoModel> listar() {
		List<Pedido> todosPedidos = pedidoRepository.findAll();
		
		return pedidoResumoModelAssembler.toCollectionModel(todosPedidos);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PedidoModel adicionar(@Validated @RequestBody PedidoInput pedidoInput) {
		try {
			Pedido novoPedido = pedidoInputDisassembler.toDomainObject(pedidoInput);

			// TODO pegar usuário autenticado
			//novoPedido.setCliente(new Usuario());
			//novoPedido.getCliente().setId(1L);

			novoPedido = emissaoPedido.emitir(novoPedido);

			return pedidoModelAssembler.toModel(novoPedido);
		} catch (EntidadeNaoEncontradaException e) {
			throw new NegocioException(e.getMessage(), e);
		}
	}
	
	@GetMapping("/{pedidoId}")
	public PedidoModel buscar(@PathVariable Long pedidoId) {
		Pedido pedido = emissaoPedido.buscarOuFalhar(pedidoId);
		
		return pedidoModelAssembler.toModel(pedido);
	}
	
}
