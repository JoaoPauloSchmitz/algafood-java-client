package com.algaworks.algafood.client.model.input;

import lombok.Data;

@Data
public class EnderecoInput {

    private CidadeIdInput cidade;
    private String cep;
    private String logradouro;
    private String numero;
    private String bairro;

}
