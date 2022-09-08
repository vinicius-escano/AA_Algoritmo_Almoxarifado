TRUNCATE PRATELEIRAS_ESTOQUE_MATRIZ;
TRUNCATE PRODUTO;

INSERT INTO PRATELEIRAS_ESTOQUE_MATRIZ
	(ID_PRATELEIRA, QUADRANTE)
VALUES
	('A1',0),
	('A2',0),
    ('B1',0),
	('B2',0),
    ('C1',0),
	('C2',0),
    ('D1',0),
	('D2',0),
    ('E1',0),
    ('Z4',0),
	('E2',0),
    ('F1',0),
	('F2',0),
    ('G1',0),
	('G2',0),
    ('H1',0),
	('H2',0),
    ('I1',0),
	('I2',0),
    ('J1',0),
	('J2',0);

INSERT INTO PRATELEIRAS_ESTOQUE_MATRIZ
	(ID_PRATELEIRA, QUADRANTE)
VALUES
	('K1',1),
	('K2',1),
    ('L1',1),
	('L2',1),
    ('M1',1),
	('M2',1),
    ('N1',1),
	('N2',1),
    ('O1',1),
	('O2',1),
    ('P1',1),
	('P2',1),
    ('Q1',1),
    ('Z3',1),
	('Q2',1),
    ('R1',1),
	('R2',1),
    ('S1',1),
	('S2',1),
    ('T1',1),
	('T2',1),
    ('U1',1),
	('U2',1),
    ('V1',1),
	('V2',1),
    ('X1',1),
	('X2',1),
	('Z2',1);

INSERT INTO PRATELEIRAS_ESTOQUE_MATRIZ
	(ID_PRATELEIRA, QUADRANTE)
VALUES
	('A',2),
	('B',2),
    ('BA',2),
    ('C',2),
    ('CA',2),
    ('D',2),
    ('DA',2),
    ('E',2),
    ('EA',2),
    ('F',2),
    ('FA',2),
    ('G',2),
    ('GA',2),
    ('I',2),
    ('IA',2),
    ('J',2),
    ('JA',2),
    ('K',2),
    ('KA',2),
    ('L',2),
    ('LA',2);

INSERT INTO PRATELEIRAS_ESTOQUE_MATRIZ
    (ID_PRATELEIRA, QUADRANTE)
VALUES
     ('RT4',4),
     ('RV',4),
     ('RT3',4),
     ('RT2',4),
     ('RT1',4);

INSERT INTO PRATELEIRAS_ESTOQUE_MATRIZ
	(ID_PRATELEIRA, QUADRANTE)
VALUES
	('M',3),
	('MA',3),
    ('N',3),
	('NA',3),
    ('O',3),
	('OA',3),
    ('P',3),
	('PA',3),
    ('Q',3),
	('QA',3),
    ('R',3),
	('RA',3),
    ('S',3),
	('SA',3),
    ('T',3),
	('TA',3),
    ('U',3),
	('UA',3),
    ('V',3),
	('VA',3),
    ('X',3),
	('XA',3),
    ('Y',3),
	('YA',3),
	('Z1',3);

INSERT INTO PRODUTO
    (DESCRICAO, LOCALIZACAO)
VALUES
    ('PRODUTO_1','B2-0003'),
    ('PRODUTO_2','C2-0245'),
    ('PRODUTO_3','G1-0116'),
    ('PRODUTO_4','H2-0145'),
    ('PRODUTO_5','I1-0256'),
    ('PRODUTO_6','J2-0057'),
    ('PRODUTO_7','K1-0146'),
    ('PRODUTO_8','M2-0054'),
    ('PRODUTO_9','N1-0016'),
    ('PRODUTO_10','A2-0065'),
    ('PRODUTO_11','X1-0174'),
    ('PRODUTO_12','F1-0201'),
    ('PRODUTO_13','U2-0035'),
    ('PRODUTO_14','D2-0084'),
    ('PRODUTO_15','D-0049'),
    ('PRODUTO_16','BA-0163'),
    ('PRODUTO_17','C-0084'),
    ('PRODUTO_18','EA-0165'),
    ('PRODUTO_19','FA-0096'),
    ('PRODUTO_20','J-0123'),
    ('PRODUTO_21','K-0134'),
    ('PRODUTO_22','LA-0016'),
    ('PRODUTO_23','O-0096'),
    ('PRODUTO_24','PA-0074'),
    ('PRODUTO_25','X-0112'),
    ('PRODUTO_26','YA-0193'),
    ('PRODUTO_27','T-0264'),
    ('PRODUTO_28','VA-0289'),
    ('PRODUTO_29','RA-0220'),
    ('PRODUTO_30','Z2-0051'),
    ('PRODUTO_31','Z4-0145'),
    ('PRODUTO_32','Z3-0100'),
    ('PRODUTO_33','Z1-0028'),
    ('PRODUTO_34','Z3-0101'),
    ('PRODUTO_35','Z4-0130'),
    ('PRODUTO_36','RT1-0038'),
    ('PRODUTO_37','RT2-0074'),
    ('PRODUTO_38','RT3-0156'),
    ('PRODUTO_39','RT4-0190'),
    ('PRODUTO_40','RV-0015');



