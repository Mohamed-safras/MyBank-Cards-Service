package org.acentura.cards.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Schema(
        name = "Response",
        description = "Schema to hold successful response information"
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {

    @Schema(
            description = "Status code in the response"
    )
    private String statusCode;

    @Schema(
            description = "Status message in the response"
    )
    private String statusMsg;


    @Schema(
            name = "data",
            description = ""
    )
    @Nullable
    private T data;

    public ApiResponse(String status201, String message201) {
        this.statusCode = status201;
        this.statusMsg = message201;
    }
}
