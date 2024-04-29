package entity;

import java.util.List;
import javax.annotation.Resource;
import javax.persistence.*;

public class Service_Product {

    @PersistenceContext
    EntityManager mgr;
    @Resource
    Query query;

    public Service_Product(EntityManager mgr) {
        this.mgr = mgr;
    }

    public boolean addProduct(Product product) {
        mgr.persist(product);
        return true;
    }

    
    public Product findProductByid(String prodId) {
        Product product = mgr.find(Product.class, prodId);
        return product;
    }

    public boolean deleteProduct(String prodId) {
         Product product = findProductByid(prodId);
        if (product != null) {
            mgr.remove(product);
            return true;
        }
        return false;
    }

    public List<Product> findAll() {
        List productList = mgr.createNamedQuery("Product.findAll").getResultList();
        return productList;
    }

    public boolean updateProduct(Product product) {
        Product tempProduct = findProductByid(product.getProdId());
        if (tempProduct != null) {
            tempProduct.setProdName(product.getProdName());
            tempProduct.setProdDesc(product.getProdDesc());
            tempProduct.setProdPrice(product.getProdPrice());
            tempProduct.setProdStock(product.getProdStock());
            tempProduct.setProdSales(product.getProdSales());
            tempProduct.setProdImg(product.getProdImg());
            return true;
        }
        return false;
    }
}