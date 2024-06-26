package com.example.soporte.DTO;

import com.example.soporte.models.Product.Version;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class CreateTicketDTO{
    @NotNull(message = "title can not be null.")
    @Size(min = 2, max = 100, message = "title must be at least 2 and max 100 characters.")
    public String title;

    @Size(max = 300, message = "description max size is 300 characters.")
    public String description;

    @NotBlank(message = "severity can not be blank.")
    public String severity;

    @NotBlank(message = "status can not be blank.")
    public String status;

    @NotNull(message = "versionId can not be null.")
    @Positive(message = "versionId must be positive.")
    public Long versionId;

    @NotNull(message = "clientId can not be null.")
    @Positive(message = "clientId must be positive.")
    public Long clientId;

    @Positive(message = "employeeId must be positive.")
    public Long employeeId;

    @Size(max = 20, message = "Can not relate more than 20 tasks at once.")
    public List<Long> tasksIds = new ArrayList<>();

    //Campos que no se espera que vengan en la request:
    @JsonIgnore
    public Version version;
}