# 📱 Desafio de Programação Orientada a Objetos - Modelagem de um iPhone

## 🎯 Objetivo
O objetivo deste desafio foi aplicar os princípios da **Programação Orientada a Objetos (POO)** para modelar um componente `iPhone`, com base na apresentação oficial do produto feita por Steve Jobs em 2007. O projeto envolveu a **modelagem UML** e a **implementação em Java** de três funcionalidades principais do dispositivo.

---

## 🧩 Funcionalidades Modeladas

O iPhone foi dividido em três interfaces funcionais distintas:

- **Reprodutor Musical**
  - `tocar()`
  - `pausar()`
  - `selecionarMusica(String musica)`

- **Aparelho Telefônico**
  - `ligar(String numero)`
  - `atender()`
  - `iniciarCorreioVoz()`

- **Navegador na Internet**
  - `exibirPagina(String url)`
  - `adicionarNovaAba()`
  - `atualizarPagina()`

A classe `iPhone` implementa todas essas interfaces, centralizando as funcionalidades em um único componente.

---

## 🧱 Diagrama UML

O diagrama foi elaborado para representar a estrutura do sistema, evidenciando a implementação das interfaces pela classe `iPhone`. Cada funcionalidade foi isolada em uma interface específica, promovendo organização e reutilização de código.

![UML iPhone]([[[https://drive.google.com/file/d/1LhoWSouN8UsEg8VG1sl3yHBfBDR3q_aJ/view?usp=drive_link](https://drive.google.com/file/d/1LhoWSouN8UsEg8VG1sl3yHBfBDR3q_aJ/view?usp=sharing)](https://drive.google.com/file/d/1LhoWSouN8UsEg8VG1sl3yHBfBDR3q_aJ/view?usp=sharing)](https://viewer.diagrams.net/?tags=%7B%7D&lightbox=1&highlight=0000ff&edit=_blank&layers=1&nav=1&title=Uml%20iPhone%202007.drawio.png&dark=auto#R%3Cmxfile%3E%3Cdiagram%20name%3D%22P%C3%A1gina-1%22%20id%3D%22-KRPaTejZIg2Gugrxs9Z%22%3E7Vrfc5s4EP5rPJM%2BJGPAGPsxOGl7naTnqTt37aMMCugiWI8Q%2FpG%2F%2FlYgjLHBhXGc5MFPYZeVkHY%2F7addp2dNovUXQRbhI%2FiU98y%2Bv%2B5Zdz3TNAbjIf5Rmk2ucRwzVwSC%2BdqoVMzYC9XKvtamzKdJxVACcMkWVaUHcUw9WdERIWBVNXsCXv3qggT0QDHzCD%2FU%2Fst8GebakemU%2Bq%2BUBWHxZWM4zt9EpDDWO0lC4sNqR2Xd96yJAJD5U7SeUK6cV%2FglH%2Fe54e12YYLGss0A%2B9eDA9%2FWk%2Fnz72%2FO178ZfZwurg292kRuih1THx2gRRAyhABiwu9LrSsgjX2qpu2jVNo8ACxQaaDyPyrlRkeTpBJQFcqI67e4YrH5pcbf2IX4W0%2BXCXfrirQppDWT%2BbDx2NFyNu6mbxVyOVQJuyOnVLCISiq07tCB2qcJpMKjR7xmDjQSiQioPOZeKzdUPt35hA7QFwq4HrFBA0E5kWxZBR3R2A22dtuhU2C4aLOvz9lwpEGmT5lRyMUU%2BZb0qBIk%2BLCzjFKVQacDjOz8a0vCU72FnjkkEaLB5TJz9a70gy4E%2BIgK8ZgmDM%2Fa9nVQMdbSHj6TFYs4iRUQnyCWBVQVrghnQYzPHkZUhdldUiHVB271C6kA6noh4%2F4D2UCqYpdI4j0XkhuCYC84LSmwiq%2BF1Eg2hxWLmRqpwSRogjbTAkzGnuqRrCuGDySRWuEB52SRsPl2GxHCisUuSAmRNlqFTNLZgmSwXGGqrR6oRigrB9D1Uejpt%2BagCiHL0fKqTHumrXXhTsobD5rRWsFZV1A5NaDawwJnGQ4SKeB5m5%2BVQ54Y5xPgoM56DJlRAQ5On2QNNCLm%2B1l2S9DLLA5%2BZrns2ig1D9nAO6vU%2FNBesLKkKIkkeRBVxDiZUz6FhEkGan6R27oLdQYzV9luz77LNEJOIMZNEJaFjyI4VlQBRO%2Bs2AmLQ8xhsjbgR8%2Fln1Ggo24O2wV9dKaYj2pi7mac7xFx9QlTQ5ZBfLbER50f3MwTaaIN8twRz5NFnkt0AvpcGdMwTUI59TBeRGemq5kUGGdF55n8qWm%2BPVyitw%2Bjp3HYHZp51qqicHCIQqUCHPvEs2tGiICmcQ0yqwh0MboTxcOIRXOCslHKf4Rn57T0Oii1Bu1QOuyfCabjTnx3qzzAQ%2FiJ6ELKYh5cCO%2F9Cc82PxrhGUYNrC6M14nxxq1h8EEYzzAbKA%2BjhIy2JaA4jaiARoI7oDIiKRZpAp9OZkWGKYsRMQEhKIN%2F4KX9jBdePIEXO2P53XmxqHdbEuN3sqQB8UH8pegrxlL6wovvzoujfgtetN6UF%2BvaCxde7MSL25N5EjHWhf1sxDhsIEa6ZnMmpgSPxk6BlgregRx9lpd532FJbufkqrGwa2TXFFH0QoplXAjxLQixO4jrGLEOxOdjROcg5m%2FbYB84o95Oi%2F26f9Pvb5vuTX12Je23y4vmezaD1at0380P2X3XtHHu5rs9fN%2Fmu2m%2FM8Q6%2FYZzQtyNlnEfv3bcT8oA5mFVz6ahyueXC%2B2bXGht07mxqyd0UHeltQ9pwXDOdac16yqly5220522AxSO3Wlr4n6uO21BXaf8vvEmv2fUzdfYkGo9g%2B5JddtGffep9fCj1UL7lZ9UMNRVC5fq4LWrg%2B7poLY6qKOBQffyAMXyf3vyq175H1LW%2Ff8%3D%3C%2Fdiagram%3E%3C%2Fmxfile%3E))

