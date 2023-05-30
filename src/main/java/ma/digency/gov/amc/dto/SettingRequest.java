package ma.digency.gov.amc.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class SettingRequest {

    private String valueSetting;

    private String descriptionSetting;

    private LocalDate endDate;

    private LocalDate startedDate;
}
