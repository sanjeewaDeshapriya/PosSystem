package com.kavindu.hotelapplication.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Embeddable
@Getter
@Setter
public class CustomerPhoneId {

    private Integer customerId;
    private String phone;

    public CustomerPhoneId() {}

    public CustomerPhoneId(Integer customerId, String phone) {
        this.customerId = customerId;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerPhoneId that)) return false;
        return Objects.equals(customerId, that.customerId) &&
                Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, phone);
    }


}
