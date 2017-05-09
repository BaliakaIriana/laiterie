/*==============================================================*/
/* DBMS name:      PostgreSQL 8                                 */
/* Created on:     09/05/2017 15:33:47                          */
/*==============================================================*/


drop index formule2_fk;

drop index formule_fk;

drop index formule_pk;

drop table formule cascade;

drop index matierepremiere_pk;

drop table matierepremiere cascade;

drop index stock_premiere_fk;

drop index mvtpremiere_pk;

drop table mvtpremiere cascade;

drop index stock_produit_fk;

drop index mvtproduit_pk;

drop table mvtproduit cascade;

drop index produit_pk;

drop table produit cascade;

drop index utilisateur_pk;

drop table utilisateur cascade;

/*==============================================================*/
/* Table: formule                                               */
/*==============================================================*/
create table formule (
   idformule            serial                 not null,
   idmatierepremiere    int4                 not null,
   idproduit            int4                 not null,
   valeur               numeric              not null,
   constraint pk_formule primary key (idformule)
);

/*==============================================================*/
/* Index: formule_pk                                            */
/*==============================================================*/
create unique index formule_pk on formule (
idformule
);

/*==============================================================*/
/* Index: formule_fk                                            */
/*==============================================================*/
create  index formule_fk on formule (
idmatierepremiere
);

/*==============================================================*/
/* Index: formule2_fk                                           */
/*==============================================================*/
create  index formule2_fk on formule (
idproduit
);

/*==============================================================*/
/* Table: matierepremiere                                       */
/*==============================================================*/
create table matierepremiere (
   idmatierepremiere    serial               not null,
   designation          varchar(255)         not null,
   unite                numeric              null,
   mesure               varchar(50)          null,
   seuilmin             numeric              not null,
   constraint pk_matierepremiere primary key (idmatierepremiere)
);

/*==============================================================*/
/* Index: matierepremiere_pk                                    */
/*==============================================================*/
create unique index matierepremiere_pk on matierepremiere (
idmatierepremiere
);

/*==============================================================*/
/* Table: mvtpremiere                                           */
/*==============================================================*/
create table mvtpremiere (
   idmvtpremiere        serial               not null,
   idmatierepremiere    int4                 null,
   datemvtpremiere      date                 not null,
   quantite             numeric              not null,
   constraint pk_mvtpremiere primary key (idmvtpremiere)
);

/*==============================================================*/
/* Index: mvtpremiere_pk                                        */
/*==============================================================*/
create unique index mvtpremiere_pk on mvtpremiere (
idmvtpremiere
);

/*==============================================================*/
/* Index: stock_premiere_fk                                     */
/*==============================================================*/
create  index stock_premiere_fk on mvtpremiere (
idmatierepremiere
);

/*==============================================================*/
/* Table: mvtproduit                                            */
/*==============================================================*/
create table mvtproduit (
   idmvtproduit         serial               not null,
   idproduit            int4                 null,
   datemvtproduit       date                 not null,
   quantite             numeric              not null,
   constraint pk_mvtproduit primary key (idmvtproduit)
);

/*==============================================================*/
/* Index: mvtproduit_pk                                         */
/*==============================================================*/
create unique index mvtproduit_pk on mvtproduit (
idmvtproduit
);

/*==============================================================*/
/* Index: stock_produit_fk                                      */
/*==============================================================*/
create  index stock_produit_fk on mvtproduit (
idproduit
);

/*==============================================================*/
/* Table: produit                                               */
/*==============================================================*/
create table produit (
   idproduit            serial               not null,
   nomproduit           varchar(255)         not null,
   unite                numeric              null,
   mesure               varchar(50)          null,
   constraint pk_produit primary key (idproduit)
);

/*==============================================================*/
/* Index: produit_pk                                            */
/*==============================================================*/
create unique index produit_pk on produit (
idproduit
);

/*==============================================================*/
/* Table: utilisateur                                           */
/*==============================================================*/
create table utilisateur (
   idutilisateur        serial               not null,
   email                varchar(255)         not null,
   nomutilisateur       varchar(255)         null,
   privilege            int2                 not null,
   password             varchar(100)         null,
   constraint pk_utilisateur primary key (idutilisateur)
);

/*==============================================================*/
/* Index: utilisateur_pk                                        */
/*==============================================================*/
create unique index utilisateur_pk on utilisateur (
idutilisateur
);

alter table formule
   add constraint fk_formule_formule_matierep foreign key (idmatierepremiere)
      references matierepremiere (idmatierepremiere)
      on delete restrict on update restrict;

alter table formule
   add constraint fk_formule_formule2_produit foreign key (idproduit)
      references produit (idproduit)
      on delete restrict on update restrict;

alter table mvtpremiere
   add constraint fk_mvtpremi_stock_pre_matierep foreign key (idmatierepremiere)
      references matierepremiere (idmatierepremiere)
      on delete restrict on update restrict;

alter table mvtproduit
   add constraint fk_mvtprodu_stock_pro_produit foreign key (idproduit)
      references produit (idproduit)
      on delete restrict on update restrict;

