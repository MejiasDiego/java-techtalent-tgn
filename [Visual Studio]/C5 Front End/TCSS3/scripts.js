function luckySearch() {
  const query = document.querySelector(".search-input").value;
  window.location.href = `https://www.google.com/search?btnI=I&q=${encodeURIComponent(
    query
  )}`;
}

function changeLanguage(lang) {
  const translations = {
    es: {
      search: "Buscar con Google",
      lucky: "Voy a tener suerte",
      offeredIn: "Ofrecido por Google en:",
      advertising: "Publicidad",
      business: "Empresa",
      howSearchWorks: "Cómo funciona la Búsqueda",
      privacy: "Privacidad",
      terms: "Términos",
      settings: "Configuración",
    },
    ca: {
      search: "Cercar amb Google",
      lucky: "Em sento afortunat",
      offeredIn: "Ofert per Google en:",
      advertising: "Publicitat",
      business: "Empresa",
      howSearchWorks: "Com funciona la Cerca",
      privacy: "Privadesa",
      terms: "Termes",
      settings: "Configuració",
    },
    gl: {
      search: "Buscar con Google",
      lucky: "Síntome con sorte",
      offeredIn: "Ofrecido por Google en:",
      advertising: "Publicidade",
      business: "Empresa",
      howSearchWorks: "Como funciona a Busca",
      privacy: "Privacidade",
      terms: "Termos",
      settings: "Configuración",
    },
    eu: {
      search: "Bilatu Googlerekin",
      lucky: "Zortea daukat",
      offeredIn: "Googlek eskaintzen du:",
      advertising: "Publizitatea",
      business: "Enpresa",
      howSearchWorks: "Nola funtzionatzen du Bilaketak",
      privacy: "Pribatutasuna",
      terms: "Baldintzak",
      settings: "Ezarpenak",
    },
  };

  const elements = {
    searchButton: document.querySelector('.btn[value="Buscar con Google"]'),
    luckyButton: document.querySelector('.btn[value="Voy a tener suerte"]'),
    offeredIn: document.getElementById("offered-in"),
    advertising: document.querySelector(".footer-left a:nth-child(1)"),
    business: document.querySelector(".footer-left a:nth-child(2)"),
    howSearchWorks: document.querySelector(".footer-left a:nth-child(3)"),
    privacy: document.querySelector(".footer-right a:nth-child(1)"),
    terms: document.querySelector(".footer-right a:nth-child(2)"),
    settings: document.querySelector(".footer-right a:nth-child(3)"),
  };

  const translation = translations[lang];

  elements.searchButton.value = translation.search;
  elements.luckyButton.value = translation.lucky;
  elements.offeredIn.textContent = translation.offeredIn;
  elements.advertising.textContent = translation.advertising;
  elements.business.textContent = translation.business;
  elements.howSearchWorks.textContent = translation.howSearchWorks;
  elements.privacy.textContent = translation.privacy;
  elements.terms.textContent = translation.terms;
  elements.settings.textContent = translation.settings;
}
