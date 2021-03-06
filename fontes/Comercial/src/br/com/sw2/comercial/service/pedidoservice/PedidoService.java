
package br.com.sw2.comercial.service.pedidoservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import br.com.sw2.comercial.bean.Orcamento;
import br.com.sw2.comercial.bean.Pedido;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PedidoService", targetNamespace = "http://www.sw2.com.br/comercial/service/PedidoService")
@XmlSeeAlso({
    br.com.sw2.comercial.bean.ObjectFactory.class,
    br.com.sw2.comercial.service.pedidoservice.ObjectFactory.class
})
public interface PedidoService {


    /**
     * 
     * @param nrcnpj
     * @param pedido
     * @return
     *     returns br.com.sw2.comercial.bean.Orcamento
     */
    @WebMethod(action = "PedidoService/fazerPedido")
    @WebResult(name = "orcamento", targetNamespace = "")
    @RequestWrapper(localName = "fazerPedido", targetNamespace = "http://www.sw2.com.br/comercial/service/PedidoService", className = "br.com.sw2.comercial.service.pedidoservice.FazerPedido")
    @ResponseWrapper(localName = "fazerPedidoResponse", targetNamespace = "http://www.sw2.com.br/comercial/service/PedidoService", className = "br.com.sw2.comercial.service.pedidoservice.FazerPedidoResponse")
    public Orcamento fazerPedido(
        @WebParam(name = "pedido", targetNamespace = "")
        Pedido pedido,
        @WebParam(name = "nrcnpj", targetNamespace = "")
        String nrcnpj);

}
