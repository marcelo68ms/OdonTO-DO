/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sw2.comercial.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author marcelo
 */
@Entity
@Table(name="TblFornecedor")
public class Fornecedor implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String cnpj;

    private String razaoSocial;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String email;
    private String fone1;
    private String fone2;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cnpj != null ? cnpj.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.cnpj == null && other.cnpj != null) || (this.cnpj != null && !this.cnpj.equals(other.cnpj))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.sw2.comercial.bean.Fornecedor[ cnpj=" + cnpj + " ]";
    }
    
}
