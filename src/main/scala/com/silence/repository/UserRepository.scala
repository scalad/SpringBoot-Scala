package com.silence.repository

import com.silence.enties.User
import org.springframework.data.jpa.repository.JpaRepository
import java.lang.Long

trait UserRepository extends JpaRepository[User, Long]