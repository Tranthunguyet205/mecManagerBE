package com.example.mecManager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.C;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.Collections;
import java.util.Date;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false, unique = true, length = 50, name = "full_name")
    private String fullName;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

//    @Enumerated(EnumType.STRING)
//    private Role role;


    @Column(nullable = false, name="gender")
    private Integer gender;

    @Column(nullable = false, name = "role_id")
    private Integer roleId;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Column(name = "update_by", nullable = true)
    private Long updatedUserId;

    @Column(name = "create_by", nullable = true)
    private Long createdUserId;


    @Column(name = "profile_picture_url")
    private String profilePictureUrl;

    @Column(name = "isActive", nullable = false)
    private Integer isActive;




//    public static UserPrincipal build(User user) {
//        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(user.getRole().name());
//
//        return new UserPrincipal(
//                user.getId(),
//                user.getUsername(),
//                user.getPasswordHash(), // chú ý: đúng field password
//                Collections.singletonList(authority),
//                Boolean.TRUE.equals(user.getIsActive())
//        );
//    }


}
