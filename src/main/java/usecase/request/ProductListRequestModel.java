package usecase.request;

import constant.ProductType;
import entity.ProductEntity;

import java.util.List;

/**
 * {@code numberOfPage} is used to specify the number of page that needs to be retrieved from the website.
 * {@code limit} is used to specify the limit products that need to be retrieved.
 * if both are available, then the numberOfPage will be used
 * */
public class ProductListRequestModel {
    private List<ProductEntity> productEntities;
    private int numberOfPage;
    private int limit;
    private ProductType productType;

    public ProductListRequestModel(int numberOfPage, int limit, ProductType productType) {
        this.numberOfPage = numberOfPage;
        this.limit = limit;
        this.productType = productType;
    }

    public ProductListRequestModel() {
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public List<ProductEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(List<ProductEntity> productEntities) {
        this.productEntities = productEntities;
    }
}
