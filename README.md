# ProjetoGerador <img align="center" alt="Gut-Js" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/javascript/javascript-plain.svg"><img align="center" alt="Gut-Android" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/androidstudio/androidstudio-original.svg">
O programa tem como função gerar um numero aleatório pré-definido ao clicar no botão.
Para funcionar o programa você precisa emular o codigo no android studio, e utilizar de um android connectado usb ou em ambiente virtual.
#
📱 Inteface: você deve criar um botão para utilizar o Onclick com a função (sortear), e um TextView om id = TextoGerador.
#
Codigo Fonte:

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear (View v){
        TextView texto = findViewById(R.id.TextoGerador);
        int numero = new Random().nextInt(10);

        texto.setText("Valor Gerado: "+numero);
    }


