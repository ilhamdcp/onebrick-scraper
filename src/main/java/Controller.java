import usecase.request.ProductListRequestModel;
import usecase.response.ProductListResponseModel;
import usecase.inputBoundary.ProductListInputBoundary;
import usecase.inputBoundary.RetrieveProductListUseCase;
import usecase.inputBoundary.WriteProductListUseCase;
import usecase.outputBoundary.ProductListOutputBoundary;
import usecase.outputBoundary.RetrieveProductListPresenter;

public class Controller {
    ProductListInputBoundary retrieveProductListUseCase = new RetrieveProductListUseCase();
    ProductListInputBoundary writeProductListUseCase = new WriteProductListUseCase();

    public ProductListResponseModel getProductList(ProductListRequestModel request) {
        ProductListResponseModel response = new ProductListResponseModel();
        ProductListOutputBoundary presenter = new RetrieveProductListPresenter();
        try {
            response = retrieveProductListUseCase.execute(request);
            presenter.parse(response, null);
        } catch (Exception e) {
            e.printStackTrace();
            presenter.parse(response, e.getMessage());
        }

        return response;
    }

    public ProductListResponseModel writeProductList(ProductListRequestModel request) {
        ProductListResponseModel response = new ProductListResponseModel();
        try {
            response = writeProductListUseCase.execute(request);
        } catch (Exception e) {
            e.printStackTrace();
            ProductListOutputBoundary presenter = new RetrieveProductListPresenter();
            presenter.parse(response, e.getMessage());
        }

        return response;
    }
}
