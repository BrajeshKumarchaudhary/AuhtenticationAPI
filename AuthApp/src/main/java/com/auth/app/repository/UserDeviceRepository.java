package com.auth.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.app.model.User;
import com.auth.app.model.UserDevice;
import com.auth.app.model.token.RefreshToken;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserDeviceRepository extends JpaRepository<UserDevice, Long> {

    @Override
    Optional<UserDevice> findById(Long id);

    Optional<UserDevice> findByRefreshToken(RefreshToken refreshToken);

    List<UserDevice> findByUserId(Long userId);

	Optional<UserDevice> findByDeviceId(String deviceId);
}
