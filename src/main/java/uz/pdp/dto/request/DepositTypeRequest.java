package uz.pdp.dto.request;

import lombok.*;
import uz.pdp.enumerators.DepositType;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DepositTypeRequest {
    private String name;
    private Float minAmount;
    private Integer interest;
    private Integer duration;
    private DepositType returnType;
}
