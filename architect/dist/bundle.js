'use strict';

// Create and append <head> elements
const head = document.head;
const metaCharset = document.createElement('meta');
metaCharset.setAttribute('charset', 'UTF-8');
head.appendChild(metaCharset);

const title = document.createElement('title');
title.textContent = 'Architect3D - Floorplan';
head.appendChild(title);

const linkStylesheet1 = document.createElement('link');
linkStylesheet1.setAttribute('rel', 'stylesheet');
linkStylesheet1.setAttribute('href', 'css/jquery-ui.css');
head.appendChild(linkStylesheet1);

const linkStylesheet2 = document.createElement('link');
linkStylesheet2.setAttribute('rel', 'stylesheet');
linkStylesheet2.setAttribute('href', 'css/bootstrap.min.css');
head.appendChild(linkStylesheet2);

const linkStylesheet3 = document.createElement('link');
linkStylesheet3.setAttribute('rel', 'stylesheet');
linkStylesheet3.setAttribute('href', 'css/app.css');
head.appendChild(linkStylesheet3);

// Create and append <body> elements
const body = document.body;

const script1 = document.createElement('script');
script1.setAttribute('src', 'js/lib/jquery-2.1.4.min.js');
body.appendChild(script1);

const script2 = document.createElement('script');
script2.setAttribute('src', 'js/lib/jquery.flip.min.js');
body.appendChild(script2);

const script3 = document.createElement('script');
script3.setAttribute('src', 'js/lib/dat.gui.min.js');
body.appendChild(script3);

const script4 = document.createElement('script');
script4.setAttribute('src', 'js/lib/quicksettings.min.js');
body.appendChild(script4);

const script5 = document.createElement('script');
script5.setAttribute('src', 'js/lib/bootstrap.min.js');
body.appendChild(script5);

const script6 = document.createElement('script');
script6.setAttribute('src', 'js/bp3djs.js');
body.appendChild(script6);

const script7 = document.createElement('script');
script7.setAttribute('src', 'js/items.js');
body.appendChild(script7);

const script8 = document.createElement('script');
script8.setAttribute('src', 'js/items_gltf.js');
body.appendChild(script8);

const script9 = document.createElement('script');
script9.setAttribute('src', 'js/app.js');
body.appendChild(script9);

// Create and append HTML elements
const interfacesDiv = document.createElement('div');
interfacesDiv.setAttribute('id', 'interfaces');
interfacesDiv.setAttribute('class', 'card');
body.appendChild(interfacesDiv);

// Create and append more HTML elements as needed...

// Note: This is a simplified version. You may need to adjust the code
// to match the exact structure and behavior of your original HTML file.
