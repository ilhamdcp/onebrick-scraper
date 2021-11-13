package usecase.inputBoundary;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import entity.ProductEntity;
import usecase.request.ProductListRequestModel;
import usecase.response.ProductListResponseModel;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Path;

public class WriteProductListUseCase implements ProductListInputBoundary {

    @Override
    public ProductListResponseModel execute(ProductListRequestModel request) throws Exception {
        ProductListResponseModel responseModel = new ProductListResponseModel();
        if (request.getProductEntities() != null && request.getProductEntities().size() > 0) {
            Path path = Path.of("output.csv");
            try(Writer writer = new FileWriter(path.toString())) {
                StatefulBeanToCsv<ProductEntity> beanToCsv = new StatefulBeanToCsvBuilder<ProductEntity>(writer)
                        .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                        .build();
                beanToCsv.write(request.getProductEntities());
            }
        } else {
            throw new UnsupportedOperationException("received product entities with size 0");
        }

        return responseModel;
    }
}
