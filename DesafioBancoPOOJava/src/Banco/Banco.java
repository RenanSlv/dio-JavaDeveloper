package Banco;

import java.util.HashMap;
import java.util.Map;

public class Banco {

    private final String NOME = "BANCO XYZ";
    private Map<String, Cliente> clientes = new HashMap<>();


    public String getNome(){
        return NOME;
    }

    public void adicionarCliente(Cliente cliente){
        clientes.put(cliente.getCpf(), cliente);
    }

    public void listarTodosOsClientes(){
        for(Cliente cliente : clientes.values()){
            System.out.println(cliente);
        }
    }



}
