package usecase.outputBoundary;

import usecase.response.ProductListResponseModel;

public interface ProductListOutputBoundary {
    ProductListResponseModel parse(ProductListResponseModel response, String error);

}
