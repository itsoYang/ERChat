# ERChat

## 介绍

ERChat 是一个以项目为维度进行管理的 ER 图绘制工具，旨在帮助用户快速便捷地绘制和管理 ER 图。结合人工智能助手（AI Agent），该工具提供智能化的辅助功能，显著提升用户的绘图效率。用户可以通过直观的界面创建、编辑以及导入导出 ER 图，同时高效管理多个项目。

## 项目初衷

本项目的构建初衷源于以下几点：

1. **实践从零到一的项目开发**：通过实际操作，深入体验项目从无到有的搭建过程。这不仅可以提升我的技术能力，还能加深对软件开发生命周期的理解。

2. **探索 AI Agent 技术**：随着人工智能的发展，AI Agent 正在各个领域中发挥越来越重要的作用。通过将 AI Agent 集成到 ER 图绘制工具中，我希望能够学习和掌握相关的 AI 技术。

3. **个人成长与分享**：这个项目不仅是技术学习的机会，也是个人成长的旅程。在开发过程中积累的经验和教训，期待更多开发者参与，共同进步。

## 功能规划

- **项目管理**: 支持创建和管理多个项目，方便用户在不同项目之间切换。
- **ER图管理**: 能够对项目中的ER图进行分类、编辑、删除等操作，提供良好的组织结构。
- **设计器**: 提供直观的拖放式界面，用户可以快速绘制ER图。
- **AI Agent集成**: 利用智能助手，帮助用户生成ER图。
- **导入导出功能**: 支持将ER图以多种格式导入和导出（如PNG, SVG, JSON等），方便与其他工具的集成和共享。
- **版本控制**: 记录ER图的历史版本，支持回滚到之前的状态。
- **团队协作**: 支持多人协作编辑ER图，实时同步更改，提升团队工作效率。
- **自定义模板**: 提供多种ER图模板，用户可以快速选择并定制化设计。

## 功能开发进度

| 功能                      | 开发进度                                                                                     |
|-------------------------|------------------------------------------------------------------------------------------|
| 项目管理                 | ![](https://geps.dev/progress/60?warningColor=32CD32&dangerColor=32CD32&successColor=32CD32) |
| ER图管理                 | ![](https://geps.dev/progress/50?warningColor=32CD32&dangerColor=32CD32&successColor=32CD32) |
| ER图绘制设计器           | ![](https://geps.dev/progress/40?warningColor=32CD32&dangerColor=32CD32&successColor=32CD32)  |
| AI Agent集成            | ![](https://geps.dev/progress/0?warningColor=32CD32&dangerColor=32CD32&successColor=32CD32)  |
| 导入导出功能             | ![](https://geps.dev/progress/0?warningColor=32CD32&dangerColor=32CD32&successColor=32CD32)   |
| 版本控制                 | ![](https://geps.dev/progress/0?warningColor=32CD32&dangerColor=32CD32&successColor=32CD32)  |
| 团队协作                 | ![](https://geps.dev/progress/0?warningColor=32CD32&dangerColor=32CD32&successColor=32CD32)  |
| 自定义模板               | ![](https://geps.dev/progress/0?warningColor=32CD32&dangerColor=32CD32&successColor=32CD32)  |

## 技术栈

- **框架**: SpringCloud + SpringBoot + Mybatis Plus
- **数据库**: MySQL + Redis + ElasticSearch + MongoDB
- **构建工具**: maven
