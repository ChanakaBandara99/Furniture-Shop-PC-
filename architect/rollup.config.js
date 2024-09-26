import babel from 'rollup-plugin-babel';
import resolve from 'rollup-plugin-node-resolve';
//import uglify from 'rollup-plugin-uglify';
import uglify from 'rollup-plugin-uglify-es';
import replace from 'rollup-plugin-replace';
import postcss from 'rollup-plugin-postcss';
import serve from 'rollup-plugin-serve'
import cssnano from 'cssnano';
import { eslint } from 'rollup-plugin-eslint';
import commonjs from 'rollup-plugin-commonjs'

var isProduction = process.env.NODE_ENV === 'production';
var cache;

export default {
  input: 'src/index.js',
  output: {
    file: 'dist/bundle.js',
    format: 'cjs'
  },
  plugins: [
    eslint({
      throwOnError: true,
      throwOnWarning: true,
      include: ['src/**/*.js'] // Specify the files to include for linting
    })
  ]
};