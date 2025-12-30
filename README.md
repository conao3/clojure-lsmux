# lsmux

An LSP (Language Server Protocol) multiplexer written in Clojure.

## Overview

lsmux is a tool for multiplexing Language Server Protocol communications, allowing you to route LSP requests across multiple language servers and aggregate their responses. Built on top of lsp4clj for robust LSP protocol handling.

## Requirements

- Java 11 or later
- Clojure 1.12.0 or later

## Installation

Clone the repository:

```bash
git clone https://github.com/conao3/clojure-lsmux.git
cd clojure-lsmux
```

## Usage

Run the application:

```bash
clojure -M -m lsmux.core
```

## Development

Start a REPL with development dependencies:

```bash
clojure -M:dev
```

Run tests:

```bash
clojure -M:test
```

## Dependencies

- [lsp4clj](https://github.com/clojure-lsp/lsp4clj) - LSP protocol implementation for Clojure
- [malli](https://github.com/metosin/malli) - Data-driven schemas for Clojure
- [tools.logging](https://github.com/clojure/tools.logging) - Logging abstraction

## License

Copyright (c) Naoya Yamashita

This project is licensed under the terms of your preferred license.
