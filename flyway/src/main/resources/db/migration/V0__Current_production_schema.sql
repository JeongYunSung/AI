-- Board 테이블 생성
CREATE TABLE board_entity
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    title      VARCHAR(255) NOT NULL,
    content    TEXT         NOT NULL,
    created_at DATETIME(6) NOT NULL,
    updated_at DATETIME(6) NOT NULL
);

-- 인덱스 생성
CREATE INDEX idx_board_title ON board_entity (title);
CREATE INDEX idx_board_created_at ON board_entity (created_at);