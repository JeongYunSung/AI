-- Member 테이블 생성
CREATE TABLE member_entity
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    username   VARCHAR(255) NOT NULL UNIQUE,
    password   VARCHAR(255) NOT NULL,
    name       VARCHAR(255) NOT NULL,
    created_at DATETIME(6) NOT NULL,
    updated_at DATETIME(6) NOT NULL
);

-- 인덱스 생성
CREATE INDEX idx_member_username ON member_entity (username);
CREATE INDEX idx_member_created_at ON member_entity (created_at);