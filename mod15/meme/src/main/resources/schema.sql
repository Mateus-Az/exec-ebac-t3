CREATE TABLE meme (
  id BIGINT NOT NULL,
   nome VARCHAR(255),
   descricao VARCHAR(255),
   data_cadastro date,
   categoria VARCHAR(255),
   usuario VARCHAR(255),
   CONSTRAINT pk_meme PRIMARY KEY (id)
);