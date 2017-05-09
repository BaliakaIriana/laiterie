--
-- PostgreSQL database dump
--

-- Dumped from database version 9.4.5
-- Dumped by pg_dump version 9.4.5
-- Started on 2017-05-09 15:51:14

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

SET search_path = public, pg_catalog;

--
-- TOC entry 2059 (class 0 OID 19009)
-- Dependencies: 173
-- Data for Name: formule; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO formule VALUES (1, 1, 1, 70);
INSERT INTO formule VALUES (2, 2, 1, 18);
INSERT INTO formule VALUES (3, 4, 1, 1);
INSERT INTO formule VALUES (4, 6, 1, 30);
INSERT INTO formule VALUES (5, 1, 2, 90);
INSERT INTO formule VALUES (6, 2, 2, 5);
INSERT INTO formule VALUES (7, 4, 2, 2);


--
-- TOC entry 2084 (class 0 OID 0)
-- Dependencies: 172
-- Name: formule_idformule_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('formule_idformule_seq', 7, true);


--
-- TOC entry 2061 (class 0 OID 19023)
-- Dependencies: 175
-- Data for Name: matierepremiere; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO matierepremiere VALUES (1, 'lait', 1, 'litre', 20);
INSERT INTO matierepremiere VALUES (2, 'sucre', 1, 'kg', 70);
INSERT INTO matierepremiere VALUES (3, 'parfum', 1, 'litre', 10);
INSERT INTO matierepremiere VALUES (4, 'conservateur', 1, 'kg', 5);
INSERT INTO matierepremiere VALUES (5, 'colorant', 1, 'litre', 10);
INSERT INTO matierepremiere VALUES (6, 'fruit', 1, 'kg', 50);


--
-- TOC entry 2085 (class 0 OID 0)
-- Dependencies: 174
-- Name: matierepremiere_idmatierepremiere_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('matierepremiere_idmatierepremiere_seq', 6, true);


--
-- TOC entry 2063 (class 0 OID 19035)
-- Dependencies: 177
-- Data for Name: mvtpremiere; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2086 (class 0 OID 0)
-- Dependencies: 176
-- Name: mvtpremiere_idmvtpremiere_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('mvtpremiere_idmvtpremiere_seq', 1, false);


--
-- TOC entry 2065 (class 0 OID 19048)
-- Dependencies: 179
-- Data for Name: mvtproduit; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2087 (class 0 OID 0)
-- Dependencies: 178
-- Name: mvtproduit_idmvtproduit_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('mvtproduit_idmvtproduit_seq', 1, false);


--
-- TOC entry 2067 (class 0 OID 19061)
-- Dependencies: 181
-- Data for Name: produit; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO produit VALUES (1, 'yaourt a la banane', 100, 'litre');
INSERT INTO produit VALUES (2, 'beurre', 100, 'kg');


--
-- TOC entry 2088 (class 0 OID 0)
-- Dependencies: 180
-- Name: produit_idproduit_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('produit_idproduit_seq', 2, true);


--
-- TOC entry 2069 (class 0 OID 19073)
-- Dependencies: 183
-- Data for Name: utilisateur; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2089 (class 0 OID 0)
-- Dependencies: 182
-- Name: utilisateur_idutilisateur_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('utilisateur_idutilisateur_seq', 1, false);


-- Completed on 2017-05-09 15:51:14

--
-- PostgreSQL database dump complete
--

