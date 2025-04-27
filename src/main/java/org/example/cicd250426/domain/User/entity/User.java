package org.example.cicd250426.domain.User.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private Long id;

    @Column(length = 255, nullable = false)
    private String nickname;

    @Column(length = 255, nullable = false, unique = true)
    private String email;

    @Column(length = 255, nullable = false)
    private String password;

    @Column(length = 100, nullable = false)
    private String name;

    private LocalDate birthdate;

    @Column(length = 10)
    private String gender;

    @Column(name = "profile_image", length = 255)
    private String profileImage;

    @CreatedDate
    private LocalDateTime createdAt;

    private Double latitude;

    private Double longitude;

    // Getter/Setter 생략 (Lombok 사용 가능)

}