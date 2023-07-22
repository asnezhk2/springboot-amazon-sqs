package net.proselyte.awssqsdemo.repository;

import net.proselyte.awssqsdemo.entity.NotificationEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface NotificationRepository extends R2dbcRepository<NotificationEntity, String> {
}
