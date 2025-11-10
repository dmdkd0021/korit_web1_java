package _38_Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
// toString, equals, hashcode,
// getter, setter,
// RequiredArgConstructor(final 붙은 필드만 초기화하는 생성자)
@AllArgsConstructor // 필드 전체 초기화하는 생성자
public class Item {
    private String name; // 상품 이름
    private int stock; // 재고량
    private boolean isOnSale; // 할인 여부
    private int price; // 상품 가격
}
