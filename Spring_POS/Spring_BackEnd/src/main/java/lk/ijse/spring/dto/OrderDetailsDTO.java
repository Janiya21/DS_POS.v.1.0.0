package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class OrderDetailsDTO {
    private String oid;
    private String itemCode;
    private int qty;
    private double unitPrice;
    private double total;
}
