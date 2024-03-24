package il.receiver.external.dto;

import org.springframework.http.ResponseEntity;

public class RestResponse<T> {
    private ResponseEntity<T> responseEntity;

    public RestResponse(ResponseEntity<T> responseEntity) {
        this.responseEntity = responseEntity;
    }

    public boolean isSuccessful() {
        return responseEntity.getStatusCode().is2xxSuccessful();
    }

    public T getBody() {
        return responseEntity.getBody();
    }

    public ResponseEntity<T> getResponseEntity() {
        return responseEntity;
    }
}
