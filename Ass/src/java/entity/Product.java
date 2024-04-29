/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Yew
 */
@Entity
@Table(name = "PRODUCT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByProdId", query = "SELECT p FROM Product p WHERE p.prodId = :prodId")
    , @NamedQuery(name = "Product.findByProdName", query = "SELECT p FROM Product p WHERE p.prodName = :prodName")
    , @NamedQuery(name = "Product.findByProdDesc", query = "SELECT p FROM Product p WHERE p.prodDesc = :prodDesc")
    , @NamedQuery(name = "Product.findByProdPrice", query = "SELECT p FROM Product p WHERE p.prodPrice = :prodPrice")
    , @NamedQuery(name = "Product.findByProdStock", query = "SELECT p FROM Product p WHERE p.prodStock = :prodStock")
    , @NamedQuery(name = "Product.findByProdSales", query = "SELECT p FROM Product p WHERE p.prodSales = :prodSales")
    , @NamedQuery(name = "Product.findByProdImg", query = "SELECT p FROM Product p WHERE p.prodImg = :prodImg")})
public class Product implements Serializable {
    @OneToMany(mappedBy = "prodId")
    private List<Cart> cartList;

    @OneToMany(mappedBy = "prodId")
    private List<Comment> commentList;
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "PROD_ID")
    private String prodId;
    @Size(max = 80)
    @Column(name = "PROD_NAME")
    private String prodName;
    @Size(max = 200)
    @Column(name = "PROD_DESC")
    private String prodDesc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PROD_PRICE")
    private Double prodPrice;
    @Column(name = "PROD_STOCK")
    private Integer prodStock;
    @Column(name = "PROD_SALES")
    private Integer prodSales;
    @Size(max = 32672)
    @Column(name = "PROD_IMG")
    private String prodImg;

     public Product() {    
    }
     
    public Product(String prodId, String prodName, String prodDesc, Double prodPrice, Integer prodStock, Integer prodSales, String prodImg) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodDesc = prodDesc;
        this.prodPrice = prodPrice;
        this.prodStock = prodStock;
        this.prodSales = prodSales;
        this.prodImg = prodImg;
    }
    
   
    public Product(String prodId) {
        this.prodId = prodId;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public Double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public Integer getProdStock() {
        return prodStock;
    }

    public void setProdStock(Integer prodStock) {
        this.prodStock = prodStock;
    }

    public Integer getProdSales() {
        return prodSales;
    }

    public void setProdSales(Integer prodSales) {
        this.prodSales = prodSales;
    }

    public String getProdImg() {
        return prodImg;
    }

    public void setProdImg(String prodImg) {
        this.prodImg = prodImg;
    }
    
    @XmlTransient
    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodId != null ? prodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.prodId == null && other.prodId != null) || (this.prodId != null && !this.prodId.equals(other.prodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Product[ prodId=" + prodId + " ]";
    }
    
     @XmlTransient
    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
    
}

