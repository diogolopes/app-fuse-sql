
```
Criar banco de dados MYSQL no openshift

```
oc process openshift//mysql-persistent \
  MEMORY_LIMIT=1Gi \
  MYSQL_USER=database \
  MYSQL_PASSWORD=r3dh4t1! \
  MYSQL_ROOT_PASSWORD=r3dh4t1! \
  MYSQL_DATABASE=INFOCONV \
  VOLUME_CAPACITY=2Gi | oc create -f -

oc get po

oc rsh <pod>

mysql --user $MYSQL_USER -p
mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| INFOCONV             |
| information_schema |
+--------------------+
mysql> use INFOCONV
mysql> show tables;
Empty set (0.01 sec)

```
Criar e popular a tabela

```
CREATE TABLE VW_INFOCONV_PESSOA_JURIDICA (
    ID_REGISTRO int,
    CNPJ varchar(14)
);

CREATE TABLE VW_INFOCONV_PESSOA_FISICA (
    ID_REGISTRO int,
    CPF varchar(11)
);


INSERT INTO VW_INFOCONV_PESSOA_JURIDICA (ID_REGISTRO, CNPJ) VALUES (1, '13549622000115');
INSERT INTO VW_INFOCONV_PESSOA_JURIDICA (ID_REGISTRO, CNPJ) VALUES (2, '72605232000184');
INSERT INTO VW_INFOCONV_PESSOA_JURIDICA (ID_REGISTRO, CNPJ) VALUES (3, '62406506000152');


INSERT INTO VW_INFOCONV_PESSOA_FISICA (ID_REGISTRO, CPF) VALUES (1, '84045727043');
INSERT INTO VW_INFOCONV_PESSOA_FISICA (ID_REGISTRO, CPF) VALUES (2, '77560634060');
INSERT INTO VW_INFOCONV_PESSOA_FISICA (ID_REGISTRO, CPF) VALUES (3, '66153473008');



```
Faça deploy da sua aplicação usando o Fabric8 (precisa estar logado no Openshift e no projeto que quer fazer o deploy)

```
mvn clean fabric8:deploy -Popenshift

oc create -f sample-configmap.yml
oc create -f sample-secret.yml
```

Verifique o log do pod criado!

Em caso do erro peça para o cluster-admin executar o comando:

```
oc import-image openshift/fuse7-java-openshift:1.8 --from=registry.access.redhat.com/fuse7/fuse-java-openshift --confirm -n openshift 
```



