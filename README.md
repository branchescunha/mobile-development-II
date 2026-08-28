# Mobile Development II

Projeto acadêmico desenvolvido na disciplina **Desenvolvimento Mobile II**, utilizando Android Studio e Kotlin. O repositório acompanha as atividades, exercícios e implementações realizadas ao longo do semestre, seguindo os conteúdos e orientações apresentados em aula.

## Funcionalidades

- Menu principal em GridView com quatro opções
- Cálculo do combustível mais vantajoso entre etanol e gasolina
- Comparação baseada na relação entre os preços dos combustíveis
- Limpeza dos campos e do resultado
- Navegação entre telas
- Exibição de uma lista de veículos a gasolina
- Organização dos dados utilizando ViewModel
- Gerenciamento de estado com LiveData
- Interface implementada com View Binding
- Teste unitário do MenuViewModel

## Tecnologias utilizadas

- Kotlin
- Android Studio
- XML
- Android Views
- View Binding
- ViewModel
- LiveData
- Material Components
- Gradle

## Estrutura do projeto

```text
app/
└── src/
    ├── main/
    │   ├── java/com/example/gas/
    │   │   ├── MainActivity.kt
    │   │   ├── CombustivelActivity.kt
    │   │   ├── CarroActivity.kt
    │   │   ├── model/
    │   │   │   ├── Carro.kt
    │   │   │   ├── CombustivelModel.kt
    │   │   │   └── MenuItem.kt
    │   │   └── viewmodel/
    │   │       ├── CarroViewModel.kt
    │   │       ├── CombustivelViewModel.kt
    │   │       └── MenuViewModel.kt
    │   ├── res/
    │   │   ├── drawable/
    │   │   ├── layout/
    │   │   │   ├── activity_main.xml
    │   │   │   ├── activity_combustivel.xml
    │   │   │   ├── activity_carro_activity.xml
    │   │   │   └── item_menu_card.xml
    │   │   └── values/
    │   └── AndroidManifest.xml
    └── test/
        └── java/com/example/gas/
            └── MenuViewModelTest.kt
```