package usecase.outputBoundary;

import usecase.response.ProductListResponseModel;

public class RetrieveProductListPresenter implements ProductListOutputBoundary {

    @Override
    public ProductListResponseModel parse(ProductListResponseModel response, String error) {
        if (error != null) {
            response.setError(error);
            response.setSuccess(false);
        } else {
            response.setSuccess(true);
        }
        return response;
    }
}
