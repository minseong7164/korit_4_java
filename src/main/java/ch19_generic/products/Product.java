package ch19_generic.products;

import lombok.AllArgsConstructor;
import lombok.ToString;


/*
    1. ProductController.java를 생성하시고, 다양한 타입의
    상품 정보를 저장하고, 출력하는 코드를 작성하시오.

    실행 예
        Product(productName=Laptop, productInfo=Intel i7, 16GB RAM, 512GB SSD) String
        Product
 */
@AllArgsConstructor
@ToString       // @Data를 달아서 해결하는 방법, alt + ins를 통해 toString() 메서드를 재정의하는 방법도 있습니다.
public class Product<T> {
    private String productName;
    private T productInfo;


}
