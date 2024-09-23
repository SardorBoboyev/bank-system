package uz.pdp.dto.response;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DepositTypeResponse {
    private UUID id;
    private UUID depositTypeId;
    private UUID customerId;
    private LocalDate date;
}
