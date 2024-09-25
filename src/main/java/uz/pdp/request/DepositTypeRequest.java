package uz.pdp.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.constants.DepositType;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepositTypeRequest {
    private String name;
    private Float minAmount;
    private Integer interest;
    private Integer duration;
    private DepositType returnType;
}
