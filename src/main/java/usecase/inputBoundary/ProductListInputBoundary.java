package usecase.inputBoundary;

import usecase.request.ProductListRequestModel;
import usecase.response.ProductListResponseModel;

public interface ProductListInputBoundary {
    ProductListResponseModel execute(ProductListRequestModel request) throws Exception;
}
