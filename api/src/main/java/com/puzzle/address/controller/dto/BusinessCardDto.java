package com.puzzle.address.controller.dto;

import com.puzzle.address.domain.BusinessCard;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class BusinessCardDto {
    public static class Get {
        @Getter
        @Setter
        @NoArgsConstructor
        public static class Response {
            private String email;
            private String name;
            private String rank;
            private String phoneNumber;
            private String companyName;
            private String companyUrl;
            private String companyAddress;

            public Response(com.puzzle.address.domain.BusinessCard businessCard) {
                final var response = new Response();

                response.setEmail(businessCard.getEmail());
                response.setName(businessCard.getName());
                response.setRank(businessCard.getRank());
                response.setPhoneNumber(businessCard.getPhoneNumber());
                response.setCompanyName(businessCard.getCompanyName());
                response.setCompanyUrl(businessCard.getCompanyUrl());
                response.setCompanyAddress(businessCard.getCompanyAddress());
            }
        }
    }

    public static class Update {
        @Getter
        public static class Request {
            @NotEmpty
            private String name;
            @NotEmpty
            @Email
            private String email;
            private String rank;
            private String phoneNumber;
            private String companyName;
            private String companyUrl;
            private String companyAddress;
        }
    }

    @Getter
    @NoArgsConstructor
    public static class BusinessCard {
        private String uuid;
        private String name;
        private String email;
        private String rank;
        private String companyName;
        private String companyUrl;
        private String companyAddress;

        public BusinessCard(final com.puzzle.address.domain.BusinessCard businessCard) {
            this.uuid = businessCard.getUuid();
            this.name = businessCard.getName();
            this.email = businessCard.getEmail();
            this.rank = businessCard.getRank();
            this.companyName = businessCard.getCompanyName();
            this.companyUrl = businessCard.getCompanyUrl();
            this.companyAddress = businessCard.getCompanyAddress();
        }
    }
}
