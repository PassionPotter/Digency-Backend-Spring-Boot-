package ma.digency.gov.amc.dto.proposalproject;

import lombok.Getter;
import lombok.Setter;
import ma.digency.gov.amc.repository.entity.Address;
import ma.digency.gov.amc.repository.entity.BirthData;
import ma.digency.gov.amc.repository.entity.proposalproject.ArtisticProfession;
import ma.digency.gov.amc.utils.enumeration.IdentityType;
import ma.digency.gov.amc.utils.enumeration.MaritalStatus;
import ma.digency.gov.amc.utils.enumeration.StatusEnum;

import javax.persistence.Column;
import java.time.LocalDate;
import java.time.OffsetDateTime;


@Getter
@Setter
public class ArtistAccountResponse {
    private String refArtistAccount;

    private String cin;

    private String firstName;

    private String lastName;

    private String firstNameAR;

    private String lastNameAR;

    private String artistName;

    private String artistNameAR;

    private String gender;

    private IdentityType identityType;

    private String identityNumber;

    private String identityProfType;

    private String artistSpeciality;

    private String artistSpecialityAR;

    private String email;

    private String phoneNumber;

    private String otherPhoneNumber;

    private MaritalStatus maritalStatus;

    private Integer dependentChildren;

    private String otherJobName;

    private String socialSecurityName;

    private String socialSecurityID;

    private LocalDate artisticWorkStartDate;

    private String lastArtisticActivity;

    private String teamName;

    private LocalDate teamCreationDate;

    private String studyLevel;

    private String artisticEtablishmentName;

    private BirthData birthdata;

    private String ribNumber;

    private String domainName;

    private StatusEnum status;

    private Address address;

    private GeneralInformationResponse generalInformation;

    private ArtisticProfession artisticProfession;

    private OffsetDateTime dateCreation;

    private OffsetDateTime dateModification;
}
