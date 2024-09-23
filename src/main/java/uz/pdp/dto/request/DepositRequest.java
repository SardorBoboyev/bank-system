package uz.pdp.dto.request;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DepositRequest {
    private UUID depositTypeId;
    private UUID customerId;
    private LocalDate date;
}
