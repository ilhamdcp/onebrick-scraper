import constant.ProductType;
import usecase.request.ProductListRequestModel;
import usecase.response.ProductListResponseModel;
/**
 * The program can be executed through the main class.
 * Currently the program cannot retrieve the product description and rating
 * since there is a blocker found which cannot navigate to product detail page
 * to retrieve those elements.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        Controller controller = new Controller();
        ProductListResponseModel responseModel = controller.getProductList(new ProductListRequestModel(0, 100, ProductType.PHONE));
        if (responseModel.getError() != null) {
            System.out.println(responseModel.getError());
        } else {
            ProductListRequestModel writeRequest = new ProductListRequestModel();
            writeRequest.setProductEntities(responseModel.getProducts());
            ProductListResponseModel writeResponse = controller.writeProductList(writeRequest);
        }
    }
}
