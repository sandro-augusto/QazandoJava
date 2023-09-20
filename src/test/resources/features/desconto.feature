# language: pt

    Funcionalidade: Receber o cupom de desconto do Qazando
      Eu como usuário do Qazando
      quero receber um cupom de desconto
      para eu comprar um curso com valor reduzido
    @login
    Cenário: Visualizar código de desconto
      Dado que esteja no site da Qazando
      Quando informar os dados necessário para receber o cupom
      Então séra visualizado o código do cupom